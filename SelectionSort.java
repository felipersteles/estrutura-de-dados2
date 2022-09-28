
    //metodo select sorte
    private static void SelectionSort(char[] vetor){

        int indiceMenor;
        char menor;

        for(int i = 0; i< vetor.length - 1; i++){
            indiceMenor = i;
            menor = vetor[i];

            for(int j =i+1;j<vetor.length; j++){
                if(vetor[j] < vetor[indiceMenor]){
                    indiceMenor = j;
                    menor = vetor[indiceMenor];
                }
            }

            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }

        for(int i = 0; i<vetor.length; i++){
            System.out.print(vetor[i]);
        }
    }
