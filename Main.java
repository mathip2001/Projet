public class Main {
    public static void main(String[]args) {
        
        System.out.println("Liste des Entrees :");

        System.out.println("Liste des Entrees AvecViande :");
        Quiche q1 = new Quiche();
        System.out.println("quiche froide\n" + q1);
        System.out.println();
        Quiche q2 = new Quiche(200,3.0,250,true);
        q2.livrerChaud();//proposer s'il veut qu'on livre chaud
        System.out.println("quiche chaude\n" + q2);
        System.out.println();

        OmeletteDinde od1 = new OmeletteDinde();
        System.out.println("omelette froide\n" + od1);
        System.out.println();
        OmeletteDinde od2 = new OmeletteDinde(300,5.0,400,true);
        od2.livrerChaud();//proposer s'il veut qu'on livre chaud
        System.out.println("omelette chaude\n" + od2);
        System.out.println();

        System.out.println("Liste des Entrees SansViande :");
        SaladeVegetarienne sv1 = new SaladeVegetarienne();
        System.out.println("petite salade vegetarienne\n" + sv1);
        System.out.println();
        SaladeVegetarienne sv2 = new SaladeVegetarienne(150,4.5,3);
        sv2.setConsistant(true);//proposer s'il veut doubler la portion
        System.out.println("grande salade vegetarienne\n" + sv2);
        System.out.println();

        SaladeAvocat sa1 = new SaladeAvocat();
        System.out.println("petite salade avocat\n" + sa1);
        System.out.println();
        SaladeAvocat sa2 = new SaladeAvocat(150,3.5,2);
        sa2.setConsistant(true);//proposer s'il veut doubler la portion
        System.out.println("grande salade avocat\n" + sa2);
        System.out.println();
        System.out.println();
        
        
        System.out.println("Liste des Plats :");

        System.out.println("Liste des PlatChaud :");
        Burger bu1 = new Burger();
        System.out.println(bu1);
        System.out.println();

        RizDinde rd1 = new RizDinde();
        System.out.println(rd1);
        System.out.println();

        System.out.println("Liste des PlatFroid:");
        Bagel ba1 = new Bagel();
        System.out.println(ba1);
        System.out.println();

        PatesPesto pp1 = new PatesPesto();
        System.out.println(pp1);
        System.out.println();
        System.out.println();
        
        
        System.out.println("Liste des Desserts :");
        
        System.out.println("ProduitLaitier :");
        System.out.println("Liquide :");
        
        Yaourt y1 = new Yaourt();
        System.out.println(y1);
        System.out.println();
        Yaourt y2 = new Yaourt(150, 0.5, false, 30);
        y2.ajouterSucre();//proposer l'ajout de sucre
        System.out.println(y2);
        System.out.println();

        System.out.println("Solide :");
        Fromage f = new Fromage();
        System.out.println(f);
        System.out.println();

        System.out.println("Fruit :");
        GateauBanane gb = new GateauBanane();
        System.out.println(gb);
        System.out.println();

        TarteAuxMyrtilles tam = new TarteAuxMyrtilles();
        System.out.println(tam);
        System.out.println();
        System.out.println();
        

        Menu m1 = new Menu();
        m1.ajouterEntree(sv1,sa1,od1,q1);
        //vegetarien : sv1 (salade vegetarienne) / fitness : sa1 (salade avocat) 
        //prise de masse : od1 (omelette dinde) / cheatmeal : q1 (quiche)

        m1.ajouterPlat(ba1,pp1,rd1,bu1);
        //vegetarien : ba1 (bagel) / fitness : pp1 (pate pesto)
        //prise de masse : rd1 (riz dinde) / cheatmeal : bu1 (burger)

        m1.ajouterDessert(y1, gb, tam, f);
        //vegetarien : y1 (yaourt) / fitness : gb (gateau a la banane)
        //prise de masse : tam (tarte aux myrtilles) / cheatmeal : f (fromage)
        
    }
}
