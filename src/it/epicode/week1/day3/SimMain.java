import java.util.Arrays;

public class SimMain {
    public static void main(String[] args) {
        Sim sim=new Sim("38404043",5000);
        sim.stampaDatiSim();
        sim.telefonata(60,"1");
        sim.telefonata(30,"2");
        sim.telefonata(60,"3");
        sim.telefonata(30,"4");
        sim.telefonata(60,"5");
        sim.telefonata(30,"6");
        System.out.println(Arrays.toString(sim.getChiamate()));
    }


}


