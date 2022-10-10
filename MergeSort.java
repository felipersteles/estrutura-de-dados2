class MergeSorte {
    public static void main(String[ ] args) {
        char[] vetor = {'c','b','a','c','a'};
        int n = vetor.length;

        mergeSort(vetor, n);

        for(int i = 0;i< vetor.length;i++){
            System.out.print(vetor[i]);
        }
    }

    private static void mergeSort(char[] vetor, int n) {

        if (n < 2) {
            return;
        }

        int mid = n / 2;
        char[] l = new char[mid];
        char[] r = new char[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = vetor[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = vetor[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(vetor, l, r, mid, n - mid);
    }

    private static void merge(char[] vetor, char[] l, char[] r, int left, int right) {
 
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                vetor[k++] = l[i++];
            }
            else {
                vetor[k++] = r[j++];
            }
        }
        while (i < left) {
            vetor[k++] = l[i++];
        }
        while (j < right) {
            vetor[k++] = r[j++];
        }
    }
}
