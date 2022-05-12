class A extends Thread{
    public void run(){
    for(int i = 0; i<=5;i++){
        System.out.println("The number is "+i);
        try{Thread.sleep(1000);} catch(Exception e){}
    }
  }
}
class B extends Thread{
    public void run(){
    for(int i = 0; i<=5;i++){    
        System.out.println("The square of number is "+i*i);
        try{Thread.sleep(1000);}catch(Exception e){}
    }
  }
}

class C extends Thread{
    public void run(){
        for(int i = 0; i<=5;i++){
            System.out.println("The cubic of number " + i*i*i);
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Main{
    public static void main(String[] args){
        A t = new A();
        B T = new B();
        C a = new C();
        t.start();
        try {Thread.sleep(100);} catch (Exception e){}
        T.start();
        try{Thread.sleep(100);} catch (Exception e){}
        a.start();

    }
}