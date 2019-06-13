package codesignall;

public class firstDuplicate {
    public static void main(String[] args){
        int[] arr = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(arr));
    }

    static int firstDuplicate(int[] a) {
//        int key = -1;
//        int index = a.length;
//        for(int i=0;i<index;i++){
//            for(int j=i+1;j<index;j++){
//                System.out.println(i + " " + j+" "+index);
//                    if (a[i] == a[j]) {
//                        key = a[i];
//                        index = j;
//                    }
//            }
//        }
//        return key;
        Integer[] dict = new Integer[10];
        for (int i = 0; i < a.length; i++){
            if (dict[a[i]] != null)
                 dict[a[i]]++;
            else
                dict[a[i]] = 1;

            if(dict[a[i]] == 2)
                return a[i];
        }
        return -1;
    }

}
