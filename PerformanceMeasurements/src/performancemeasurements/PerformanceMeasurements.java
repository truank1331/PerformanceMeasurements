package performancemeasurements;
import java.util.*;
import java.lang.*;
class Student{
    String code;
    String name;
    int mark;
    Student(String code,String name,int mark){
        this.code = code;
        this.name = name;
        this.mark = mark;
    }
}
class genrandom{
    int genInt(){
        return new Random().nextInt(10000000);
    }
    String genString(){
        String str ="";
        int n = new Random().nextInt(9)+1;
        for(int i=0;i<n;i++){
            int num = new Random().nextInt(26)+65;
            char a = (char)num;
            str+= a;
        }
        return str;
    }
}
class Search{
    void SequentialSearch(int arr[]) {
        long ta0, ta1, sa = 0;
        genrandom geni = new genrandom();
        for (int t = 0; t < 10; t++) {
            int key = geni.genInt();
            ta0 = System.nanoTime();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    break;
                }
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SequentialSearch " + arr.length + " array 1nt: %.6f s.\n", (double) sa / 1000000000);
    }
    void SequentialSearch(Integer arr[]){
        long ta0, ta1, sa = 0;
        genrandom geni = new genrandom();
        for (int t = 0; t < 10; t++) {
            int key = geni.genInt();
            ta0 = System.nanoTime();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    break;
                }
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SequentialSearch " + arr.length + " array 1nt: %.6f s.\n", (double) sa / 1000000000);
     }
    void SequentialSearch(Student arr[]){
        long ta0, ta1, sa = 0;
        genrandom geni = new genrandom();
        for (int t = 0; t < 10; t++) {
            int key = geni.genInt();
            ta0 = System.nanoTime();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].mark == key) {
                    break;
                }
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SequentialSearch " + arr.length + " array 1nt: %.6f s.\n", (double) sa / 1000000000);
    }
    void SequentialSearch(ArrayList arr){
        long ta0, ta1, sa = 0;
        genrandom geni = new genrandom();
        for (int t = 0; t < 10; t++) {
            int key = geni.genInt();
            ta0 = System.nanoTime();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.indexOf(i) == key) {
                    break;
                }
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SequentialSearch " + arr.size() + " arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);
    }
    void SequentialSearch(LinkedList arr){
        long ta0, ta1, sa = 0;
        genrandom geni = new genrandom();
        for (int t = 0; t < 10; t++) {
            int key = geni.genInt();
            ta0 = System.nanoTime();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.indexOf(i) == key) {
                    break;
                }
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SequentialSearch " + arr.size() + " Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);
    }
}
class IntParform{
    static void Intarray() {
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        int int_Array_100[] = new int[100];
        int int_Array_1k[] = new int[1000];
        int int_Array_10k[] = new int[10000];
        int int_Array_100k[] = new int[100000];
        int int_Array_1m[] = new int[1000000];
        int int_Array_10m[] = new int[10000000];
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                int_Array_100[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                int_Array_1k[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                int_Array_10k[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                int_Array_100k[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                int_Array_1m[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                int_Array_10m[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(int_Array_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(int_Array_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(int_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(int_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(int_Array_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(int_Array_10m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10m array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(int_Array_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort100 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(int_Array_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort1k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(int_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort10k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(int_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort100k array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(int_Array_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort1m array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(int_Array_10m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort10m array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        Search s = new Search();
        s.SequentialSearch(int_Array_100);
        s.SequentialSearch(int_Array_1k);
        s.SequentialSearch(int_Array_10k);
        s.SequentialSearch(int_Array_100k);
        s.SequentialSearch(int_Array_1m);
        s.SequentialSearch(int_Array_10m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(int_Array_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(int_Array_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(int_Array_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(int_Array_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(int_Array_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(int_Array_10m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000000 array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Array_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100array 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Array_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1karray 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Array_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10karray 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Array_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100karray 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Array_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1marray 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Array_10m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10marray 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
    }
    static void Intarraylist(){
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        ArrayList int_Arraylist_100 = new ArrayList<>(100);
        ArrayList int_Arraylist_1k = new ArrayList<>(1000);
        ArrayList int_Arraylist_10k = new ArrayList<>(10000);
        ArrayList int_Arraylist_100k = new ArrayList<>(100000);
        ArrayList int_Arraylist_1m = new ArrayList<>(1000000);
        ArrayList int_Arraylist_10m = new ArrayList<>(10000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                int_Arraylist_100.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                int_Arraylist_1k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                int_Arraylist_10k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                int_Arraylist_100k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                int_Arraylist_1m.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                int_Arraylist_10m.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m arraylist 1nt: %.6f s.\n\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Arraylist_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Arraylist_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Arraylist_10k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Arraylist_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Arraylist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Arraylist_10m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10m arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        Search s = new Search();
        s.SequentialSearch(int_Arraylist_100);
        s.SequentialSearch(int_Arraylist_1k);
        s.SequentialSearch(int_Arraylist_10k);
        s.SequentialSearch(int_Arraylist_100k);
        s.SequentialSearch(int_Arraylist_1m);
        s.SequentialSearch(int_Arraylist_10m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Arraylist_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Arraylist_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Arraylist_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Arraylist_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Arraylist_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Arraylist_10m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000000 arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Arraylist_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100arraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Arraylist_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1karraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Arraylist_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10karraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Arraylist_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100karraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Arraylist_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1marraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Arraylist_10m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10marraylist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
    }
    static void Intlinkedlist(){
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        LinkedList int_Linkedlist_100 = new LinkedList<>();
        LinkedList int_Linkedlist_1k = new LinkedList<>();
        LinkedList int_Linkedlist_10k = new LinkedList<>();
        LinkedList int_Linkedlist_100k = new LinkedList<>();
        LinkedList int_Linkedlist_1m = new LinkedList<>();

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                int_Linkedlist_100.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                int_Linkedlist_1k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                int_Linkedlist_10k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                int_Linkedlist_100k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                int_Linkedlist_1m.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Linkedlist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Linkedlist_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Linkedlist_10k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Linkedlist_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(int_Linkedlist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        Search s = new Search();
        s.SequentialSearch(int_Linkedlist_100);
        s.SequentialSearch(int_Linkedlist_1k);
        s.SequentialSearch(int_Linkedlist_10k);
        s.SequentialSearch(int_Linkedlist_100k);
        s.SequentialSearch(int_Linkedlist_1m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Linkedlist_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Linkedlist_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Linkedlist_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Linkedlist_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(int_Linkedlist_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Linkedlist_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100Linkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Linkedlist_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1kLinkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Linkedlist_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10kLinkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Linkedlist_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100kLinkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Linkedlist_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1mLinkedlist 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
    }
    static void Inthashmap(){
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        HashMap<Integer, String> int_Hash_100 = new HashMap<Integer, String>();
        HashMap<Integer, String> int_Hash_1k = new HashMap<Integer, String>();
        HashMap<Integer, String> int_Hash_10k = new HashMap<Integer, String>();
        HashMap<Integer, String> int_Hash_100k = new HashMap<Integer, String>();
        HashMap<Integer, String> int_Hash_1m = new HashMap<Integer, String>();
        HashMap<Integer, String> int_Hash_10m = new HashMap<Integer, String>();

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                int_Hash_100.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                int_Hash_1k.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                int_Hash_10k.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                int_Hash_100k.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                int_Hash_1m.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                int_Hash_10m.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m Hash 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Hash_100.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 100 Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Hash_1k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 1k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Hash_10k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 10k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Hash_100k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 100k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Hash_1m.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 1m Hash 1nt: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            int_Hash_10m.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 10m Hash 1nt: %.6f s.\n", (double) sa / 1000000000);
       
    }
}
class IntegerParform{
    static void Integerarray(){
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        Integer Integer_Array_100[] = new Integer[100];
        Integer Integer_Array_1k[] = new Integer[1000];
        Integer Integer_Array_10k[] = new Integer[10000];
        Integer Integer_Array_100k[] = new Integer[100000];
        Integer Integer_Array_1m[] = new Integer[1000000];
        Integer Integer_Array_10m[] = new Integer[10000000];

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                Integer_Array_100[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                Integer_Array_1k[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa = +ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                Integer_Array_10k[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa = +ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                Integer_Array_100k[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                Integer_Array_1m[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                Integer_Array_10m[i] = geni.genInt();
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(Integer_Array_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(Integer_Array_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(Integer_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(Integer_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(Integer_Array_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.sort(Integer_Array_10m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10m array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(Integer_Array_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort100 array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(Integer_Array_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort1k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(Integer_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort10k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(Integer_Array_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort100k array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(Integer_Array_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort1m array Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.parallelSort(Integer_Array_10m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("parallelSort10m array Integer: %.6f s.\n", (double) sa / 1000000000);
        
        Search s = new Search();
        s.SequentialSearch(Integer_Array_100);
        s.SequentialSearch(Integer_Array_1k);
        s.SequentialSearch(Integer_Array_10k);
        s.SequentialSearch(Integer_Array_100k);
        s.SequentialSearch(Integer_Array_1m);
        s.SequentialSearch(Integer_Array_10m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(Integer_Array_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 array Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(Integer_Array_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 array Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(Integer_Array_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 array Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(Integer_Array_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 array Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(Integer_Array_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 array Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(Integer_Array_10m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000000 array Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Array_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100array Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Array_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1karray Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Array_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10karray 1nt: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Array_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100karray Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Array_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1marray Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Array_10m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10marray Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
    }
    static void Integerarraylist(){
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        ArrayList Integer_Arraylist_100 = new ArrayList<>(100);
        ArrayList Integer_Arraylist_1k = new ArrayList<>(1000);
        ArrayList Integer_Arraylist_10k = new ArrayList<>(10000);
        ArrayList Integer_Arraylist_100k = new ArrayList<>(100000);
        ArrayList Integer_Arraylist_1m = new ArrayList<>(1000000);
        ArrayList Integer_Arraylist_10m = new ArrayList<>(10000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                Integer_Arraylist_100.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                Integer_Arraylist_1k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                Integer_Arraylist_10k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                Integer_Arraylist_100k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                Integer_Arraylist_1m.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                Integer_Arraylist_10m.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m arraylist Integer: %.6f s.\n\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Arraylist_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Arraylist_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Arraylist_10k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Arraylist_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Arraylist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m arraylist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Arraylist_10m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10m arraylist Integer: %.6f s.\n", (double) sa / 1000000000);
        
        Search s = new Search();
        s.SequentialSearch(Integer_Arraylist_100);
        s.SequentialSearch(Integer_Arraylist_1k);
        s.SequentialSearch(Integer_Arraylist_10k);
        s.SequentialSearch(Integer_Arraylist_100k);
        s.SequentialSearch(Integer_Arraylist_1m);
        s.SequentialSearch(Integer_Arraylist_10m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Arraylist_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Arraylist_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Arraylist_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Arraylist_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Arraylist_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Arraylist_10m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000000 arraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Arraylist_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100arraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Arraylist_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1karraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Arraylist_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10karraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Arraylist_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100karraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Arraylist_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1marraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Arraylist_10m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10marraylist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
    }
    static void Integerlinkedlist(){
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        LinkedList Integer_Linkedlist_100 = new LinkedList<>();
        LinkedList Integer_Linkedlist_1k = new LinkedList<>();
        LinkedList Integer_Linkedlist_10k = new LinkedList<>();
        LinkedList Integer_Linkedlist_100k = new LinkedList<>();
        LinkedList Integer_Linkedlist_1m = new LinkedList<>();

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                Integer_Linkedlist_100.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                Integer_Linkedlist_1k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                Integer_Linkedlist_10k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                Integer_Linkedlist_100k.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                Integer_Linkedlist_1m.add(geni.genInt());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Linkedlist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Linkedlist_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Linkedlist_10k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Linkedlist_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(Integer_Linkedlist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);
        
         Search s = new Search();
        s.SequentialSearch(Integer_Linkedlist_100);
        s.SequentialSearch(Integer_Linkedlist_1k);
        s.SequentialSearch(Integer_Linkedlist_10k);
        s.SequentialSearch(Integer_Linkedlist_100k);
        s.SequentialSearch(Integer_Linkedlist_1m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Linkedlist_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Linkedlist_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Linkedlist_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Linkedlist_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(Integer_Linkedlist_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Linkedlist_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100Linkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Linkedlist_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1kLinkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Linkedlist_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10kLinkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Linkedlist_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100kLinkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Linkedlist_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1mLinkedlist Integer: %.6f s.\n", (double) sa / 1000000000);sa=0;
    }
    static void Integerhashmap(){
        genrandom geni = new genrandom();
        long ta0,ta1,sa=0;
        HashMap<Integer, String> Integer_Hash_100 = new HashMap<Integer, String>();
        HashMap<Integer, String> Integer_Hash_1k = new HashMap<Integer, String>(); 
        HashMap<Integer, String> Integer_Hash_10k = new HashMap<Integer, String>(); 
        HashMap<Integer, String> Integer_Hash_100k = new HashMap<Integer, String>(); 
        HashMap<Integer, String> Integer_Hash_1m = new HashMap<Integer, String>(); 
        HashMap<Integer, String> Integer_Hash_10m = new HashMap<Integer, String>(); 
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                Integer_Hash_100.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 Hash 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                Integer_Hash_1k.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                Integer_Hash_10k.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                Integer_Hash_100k.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k Hash 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                Integer_Hash_1m.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m Hash 1nt: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                Integer_Hash_10m.put(geni.genInt(), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m Hash Integer: %.6f s.\n", (double) sa / 1000000000);
        
         for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Hash_100.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 100 Hash Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Hash_1k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 1k Hash Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Hash_10k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 10k Hash Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Hash_100k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 100k Hash Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Hash_1m.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 1m Hash Integer: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Integer_Hash_10m.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 10m Hash Integer: %.6f s.\n", (double) sa / 1000000000);
    }
}
class StudentParform{
    static void Studentarray(){
        genrandom geni = new genrandom();
        long ta0,ta1,sa=0;
        Student student_Array_100[] = new Student[100];
        Student student_Array_1k[] = new Student[1000];
        Student student_Array_10k[] = new Student[10000];
        Student student_Array_100k[] = new Student[100000];
        Student student_Array_1m[] = new Student[1000000];
        Student student_Array_10m[] = new Student[10000000];
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        for(int i=0;i<100;i++){
            student_Array_100[i] = new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt());
        }
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("GEN 100 array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        for(int i=0;i<1000;i++){
            student_Array_1k[i] = new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt());
        }
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("GEN 1k array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        for(int i=0;i<10000;i++){
            student_Array_10k[i] = new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt());
        }
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("GEN 10k array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        for(int i=0;i<100000;i++){
           student_Array_100k[i] = new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt());
        }
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("GEN 100k array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        for(int i=0;i<1000000;i++){
            student_Array_1m[i] = new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt());
        }
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("GEN 1m array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        for(int i=0;i<10000000;i++){
            student_Array_10m[i] = new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt());
        }
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("GEN 10m array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        Arrays.sort(student_Array_100);
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("SORT100 array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        Arrays.sort(student_Array_1k);
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("SORT1k array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        Arrays.sort(student_Array_100k);
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("SORT10k array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        Arrays.sort(student_Array_100k);
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("SORT100k array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        Arrays.sort(student_Array_1m);
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("SORT1m array student: %.6f s.\n",(double)sa/1000000000);
        
        for(int t=0;t<10;t++){
        ta0 = System.nanoTime();
        Arrays.sort(student_Array_10m);
        ta1 = System.nanoTime();sa += ta1-ta0;
        }sa/=10;
        System.out.printf("SORT10m array student: %.6f s.\n",(double)sa/1000000000);
        
        Search s = new Search();
        s.SequentialSearch(student_Array_100);
        s.SequentialSearch(student_Array_1k);
        s.SequentialSearch(student_Array_10k);
        s.SequentialSearch(student_Array_100k);
        s.SequentialSearch(student_Array_1m);
        s.SequentialSearch(student_Array_10m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(student_Array_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 array student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(student_Array_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 array student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(student_Array_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 array student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(student_Array_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 array student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(student_Array_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 array student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Arrays.binarySearch(student_Array_10m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000000 array student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Array_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100array student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Array_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1karray student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Array_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10karray student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Array_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100karray student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Array_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1marray student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Array_10m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10marray student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
    }
    static void Studentarraylist(){
        genrandom geni = new genrandom();
        long ta0, ta1, sa = 0;
        ArrayList student_Arraylist_100 = new ArrayList<>(100);
        ArrayList student_Arraylist_1k = new ArrayList<>(1000);
        ArrayList student_Arraylist_10k = new ArrayList<>(10000);
        ArrayList student_Arraylist_100k = new ArrayList<>(100000);
        ArrayList student_Arraylist_1m = new ArrayList<>(1000000);
        ArrayList student_Arraylist_10m = new ArrayList<>(10000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                student_Arraylist_100.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                student_Arraylist_1k.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                student_Arraylist_10k.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                student_Arraylist_100k.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                student_Arraylist_1m.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                student_Arraylist_10m.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m arraylist student: %.6f s.\n\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Arraylist_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Arraylist_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Arraylist_10k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Arraylist_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Arraylist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m arraylist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Arraylist_10m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10m arraylist student: %.6f s.\n", (double) sa / 1000000000);
        
        Search s = new Search();
        s.SequentialSearch(student_Arraylist_100);
        s.SequentialSearch(student_Arraylist_1k);
        s.SequentialSearch(student_Arraylist_10k);
        s.SequentialSearch(student_Arraylist_100k);
        s.SequentialSearch(student_Arraylist_1m);
        s.SequentialSearch(student_Arraylist_10m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Arraylist_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 arraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Arraylist_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 arraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Arraylist_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 arraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Arraylist_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 arraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Arraylist_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 arraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Arraylist_10m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000000 arraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Arraylist_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100arraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Arraylist_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1karraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Arraylist_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10karraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Arraylist_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100karraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Arraylist_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1marraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Arraylist_10m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10marraylist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
    }
    static void Studentlinkedlist(){
        genrandom geni = new genrandom();
        long ta0,ta1,sa=0;
        LinkedList student_Linkedlist_100 = new LinkedList<>();
        LinkedList student_Linkedlist_1k = new LinkedList<>();
        LinkedList student_Linkedlist_10k = new LinkedList<>();
        LinkedList student_Linkedlist_100k = new LinkedList<>();
        LinkedList student_Linkedlist_1m = new LinkedList<>();
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                student_Linkedlist_100.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                student_Linkedlist_1k.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                student_Linkedlist_10k.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                student_Linkedlist_100k.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                student_Linkedlist_1m.add(new Student(Integer.toString(geni.genInt()), geni.genString(), geni.genInt()));
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m Linkedlist student: %.6f s.\n", (double) sa / 1000000000);


        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Linkedlist_100);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100 Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Linkedlist_1k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1k Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Linkedlist_10k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT10k Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Linkedlist_100k);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT100k Linkedlist student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.sort(student_Linkedlist_1m);
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("SORT1m Linkedlist student: %.6f s.\n", (double) sa / 1000000000);
        
        Search s = new Search();
        s.SequentialSearch(student_Linkedlist_100);
        s.SequentialSearch(student_Linkedlist_1k);
        s.SequentialSearch(student_Linkedlist_10k);
        s.SequentialSearch(student_Linkedlist_100k);
        s.SequentialSearch(student_Linkedlist_1m);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Linkedlist_100, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100 Linkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Linkedlist_1k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000 Linkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Linkedlist_10k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 10000 Linkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Linkedlist_100k, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 100000 Linkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            Collections.binarySearch(student_Linkedlist_1m, geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Binary Search 1000000 Linkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Linkedlist_100.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100Linkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Linkedlist_1k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1kLinkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Linkedlist_10k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 10kLinkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Linkedlist_100k.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 100kLinkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Linkedlist_1m.hashCode();
            
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing Search 1mLinkedlist student: %.6f s.\n", (double) sa / 1000000000);sa=0;
        
    }
    static void Studenthashmap(){
        genrandom geni = new genrandom();
        long ta0,ta1,sa=0;
        HashMap<Student, String> student_Hash_100 = new HashMap<Student, String>();
        HashMap<Student, String> student_Hash_1k = new HashMap<Student, String>(); 
        HashMap<Student, String> student_Hash_10k = new HashMap<Student, String>(); 
        HashMap<Student, String> student_Hash_100k = new HashMap<Student, String>(); 
        HashMap<Student, String> student_Hash_1m = new HashMap<Student, String>(); 
        HashMap<Student, String> student_Hash_10m = new HashMap<Student, String>(); 
        
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                student_Hash_100.put(new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt()), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100 Hash student: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                student_Hash_1k.put(new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt()), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1k Hash student: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                student_Hash_10k.put(new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt()), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10k Hash student: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                student_Hash_100k.put(new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt()), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 100k Hash student: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                student_Hash_1m.put(new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt()), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 1m Hash student: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            for (int i = 0; i < 10000000; i++) {
                student_Hash_10m.put(new Student(Integer.toString(geni.genInt()),geni.genString(),geni.genInt()), geni.genString());
            }
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("GEN 10m Hash student: %.6f s.\n", (double) sa / 1000000000);
        
        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Hash_100.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 100 Hash student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Hash_1k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 1k Hash student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Hash_10k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 10k Hash student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Hash_100k.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 100k Hash student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Hash_1m.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 1m Hash student: %.6f s.\n", (double) sa / 1000000000);

        for (int t = 0; t < 10; t++) {
            ta0 = System.nanoTime();
            student_Hash_10m.get(geni.genInt());
            ta1 = System.nanoTime();
            sa += ta1 - ta0;
        }
        sa /= 10;
        System.out.printf("Hashing 10m Hash student: %.6f s.\n", (double) sa / 1000000000);
        
    }
}
public class PerformanceMeasurements {
    public static void main(String[] args) {
        IntParform IntParform = new IntParform();
        IntParform.Intarray();             //gen sort parallel SequentialSearch BinarySearch Hashing
        IntParform.Intarraylist();         //gen sort -------- SequentialSearch BinarySearch Hashing
        IntParform.Intlinkedlist();        //gen sort -------- SequentialSearch BinarySearch Hashing
        IntParform.Inthashmap();           //gen ---- -------- ---------------- ------------ Hashing
        
        IntegerParform IntegerParform = new IntegerParform();
        IntegerParform.Integerarray();         //gen sort parallel SequentialSearch BinarySearch Hashing
        IntegerParform.Integerarraylist();     //gen sort -------- SequentialSearch BinarySearch Hashing
        IntegerParform.Integerlinkedlist();    //gen sort -------- SequentialSearch BinarySearch Hashing
        IntegerParform.Integerhashmap();       //gen ---- -------- ---------------- ------------ Hashing
        
        StudentParform StudentParform = new StudentParform();
        StudentParform.Studentarray();         //gen sort -------- SequentialSearch BinarySearch Hashing
        StudentParform.Studentarraylist();     //gen sort -------- SequentialSearch BinarySearch Hashing
        StudentParform.Studentlinkedlist();    //gen sort -------- SequentialSearch BinarySearch Hashing
        StudentParform.Studenthashmap();       //gen ---- -------- ---------------- ------------ Hashing     
    } 
}
