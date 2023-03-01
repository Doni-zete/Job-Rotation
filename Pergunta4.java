//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//
//SP – R$67.836,43
//RJ – R$36.678,66
//MG – R$29.229,88
//ES – R$27.165,48
//Outros – R$19.849,53
//
//Escreva um programa na linguagem que desejar
//onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

public class Pergunta4 {
    public static void main(String[] args) {

        double SP = 67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48,
                Outros = 19849.53, valorTotal = 0, percentualSP = 0,
                percentualRJ = 0, percentualMG = 0, percentualES = 0, percentualOutros = 0;

        valorTotal = SP + RJ + MG + ES + Outros;

        percentualSP = (SP / valorTotal) * 100;
        percentualRJ = (RJ / valorTotal) * 100;
        percentualMG = (MG / valorTotal) * 100;
        percentualES = (ES / valorTotal) * 100;
        percentualOutros = (Outros / valorTotal) * 100;

        System.out.printf("Percentual de representação SP:  %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação ES: %.2f%%\n", percentualES);

        System.out.printf("Percentual de representação Outros: %.2f%%\n", percentualOutros);

    }
}
