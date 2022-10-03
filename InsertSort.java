public class InsertSort {
    public static void main(char[] vetor) {
        char chave;

        int i, j;
        for(i = 1; i < vetor.length ; i++){
            chave = vetor[i];
            j = i - 1;

            while(j>=0 && vetor[j]>chave){
                vetor[j+1] = vetor[j];
                j = j-1;
            }

            vetor[j+1] = chave;
        }

        for( i = 0; i<vetor.length; i++){
            System.out.print(vetor[i]);
        }
    }
}
