package HerancaPolimofismo.exemplo2;

import java.text.DecimalFormat;

public class TestarPessoa {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".00 ");

        PF p1 = new PF();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000.0);
        p1.setCpf("583.358.456-62");

        PJ p2 = new PJ();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000.0);
        p2.setCnpj("91.403.512/0001-54");

        PF p3 = new PF();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000.0);
        p3.setCpf("828.277.078-70");

        PJ p4 = new PJ();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000.0);
        p4.setCnpj("35.434.693/0001-05");

        PF p5 = new PF();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3700.0);
        p5.setCpf("547.653.548-90");

        PJ p6 = new PJ();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000.0);
        p6.setCnpj("10.684.822/0001-92");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }

    }

}
