package HerancaPolimofismo.exemplo2;

import java.text.DecimalFormat;

public class TestarPessoa {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".00 ");

        PF PF1 = new PF("viana");
        System.out.println(df.format(PF1.cacularImposto(400)));


        PF PF2 = new PF("elder");
        System.out.println(df.format(PF2.cacularImposto(2000)));

        PF PF3 = new PF("Keven");
        System.out.println(df.format(PF3.cacularImposto(5000)));

        PJ PJ1 = new PJ("Eduardo");
        System.out.println(df.format(PJ1.cacularImposto(111)));

        PJ PJ2 = new PJ("Iago");
        System.out.println(df.format(PJ2.cacularImposto(254)));

        PJ PJ3 = new PJ("Margin");
        System.out.println(df.format(PJ3.cacularImposto(1360)));

    }

}
