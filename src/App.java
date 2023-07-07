public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // TESTE DA ALURA PARA CALCULO DE MÉDIA
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """ 
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de Lançamento
                """ + anoDeLancamento; 
                        
                        
        System.out.println(sinopse);
        
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


        // CLIMA TEMPO

        int temperatura = 29;
        int fahrenheit = (int )(temperatura * 1.8) + 32;
        String conversao = ("A conversão é " + fahrenheit);

        System.out.println(conversao);



        // CODIGO ALURA

       
        
        double temperaturaEmCelsius = 29;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

 

 


    }
}
