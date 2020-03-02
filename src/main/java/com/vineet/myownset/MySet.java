package com.vineet.myownset;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

interface Myownset{

    static class Entry {
        int key;
        Entry next;

        public Entry(int key, Entry next){
            this.key = key;
            this.next = next;

        }

    }

    Boolean add(int n);
    Boolean contains(Entry obj);
    Boolean remove(Entry obj);
    public abstract void  showSet();
}



public class MySet implements Myownset {

    int bucket=16;
    Entry arr[] = new Entry[bucket];

    @Override
    public Boolean add(int n) {

        Entry obj = new Entry(n,null);
//        int hash=obj.hashCode();
        int tempBucket=n%bucket;
        Entry start = arr[tempBucket];
        if(start ==  null){
            arr[tempBucket]= obj;
        }
        else{
            if(start.key == obj.key){
                return false;
            }
            while(start.next != null){
                if(start.key == obj.key){
                    return false;
                }
                start = start.next;
            }
            start.next = obj;
        }
        return true;
    }

    @Override
    public Boolean contains(Entry obj) {

        return null;
    }

    @Override
    public Boolean remove(Entry obj) {

        return null;
    }

    @Override
    public void showSet() {

        for(int i =0;i<arr.length;i++){
            Entry head = arr[i];
             while(head != null){
                 System.out.println(head.key);
                 head = head.next;
             }
        }

    }

    public static void main(String[] args) {

        MySet set = new MySet();
        set.add(3);
        set.add(16);
        set.add(32);
        set.add(48);
        set.add(3);
        set.add(55);

        System.out.println("Elements in Set are ");
        set.showSet();


    }
}
