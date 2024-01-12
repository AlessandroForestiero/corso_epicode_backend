package it.epicode.week1.progetto;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ElementoMultimediale[] lettoreMultimediale=new ElementoMultimediale[5];
        Scanner scanner=new Scanner(System.in);
        int i=0;
        while(i<lettoreMultimediale.length){
            System.out.println("che tipo di elemento vuoi inserire?(1 AUDIO,2 VIDEO,3 IMMAGINE");

            switch (scanner.nextInt()){
                case 1:
                    System.out.println("inserisci titolo");
                    String titolo = scanner.next();
                    System.out.println("inserisci volume");
                    int volume=scanner.nextInt();
                    lettoreMultimediale[i]=new Audio(titolo,volume);
                    i++;
                    break;
                case 2:
                    System.out.println("inserisci titolo");
                    String titoloVideo = scanner.next();
                    System.out.println("inserisci volume");
                    int volumeVideo=scanner.nextInt();
                    System.out.println("inserisci luminosità");
                    int luminositaVideo=scanner.nextInt();
                    lettoreMultimediale[i]=new Video(titoloVideo,volumeVideo,luminositaVideo);
                    i++;
                    break;
                case 3:
                    System.out.println("inserisci titolo");
                    String titoloImmagine = scanner.next();
                    System.out.println("inserisci luminosità");
                    int luminositaImmagine=scanner.nextInt();
                    lettoreMultimediale[i]=new Immagine(titoloImmagine,luminositaImmagine);
                    i++;
                    break;
                default:
                    System.out.println("errore digitazione");
            }

        }
        int option=-1;
        while(option!=0){
            System.out.println("quale elemento multimediale vuoi eseguire?(da 1 a 5 o 0 per uscire) ");
            option=scanner.nextInt();
            if(option>=1 && option<=5){
                if (lettoreMultimediale[option-1] instanceof Audio){
                    Audio temp = (Audio) lettoreMultimediale[option-1];
                    temp.play();
                }else{
                    if(lettoreMultimediale[option-1] instanceof Video){
                        Video temp = (Video) lettoreMultimediale[option-1];
                        temp.play();
                    }
                    else {
                            Immagine temp = (Immagine) lettoreMultimediale[option-1];
                            temp.show();
                    }
                }

            }else{
                if (option==0){
                    System.out.println("programma terminato");
                }else System.out.println("valore errato");

            }
        }
    }
}
