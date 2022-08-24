package timer;

public class Timer {
    public static boolean isTrueNum = false;

    public static void main(String[] args) throws InterruptedException {
      int random = (int) (Math.random() * 3);
        System.out.println(random);

      Thread timer1 = new Thread(new Runnable() {
          @Override
          public void run() {
              try {
                  int i = 0;
                  while (!isTrueNum) {
                      System.out.println(i);
                      i++;
                      Thread.sleep(1000);
                  }
              } catch (Exception e) {
              }
          }
      }) ;


        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = (int) (Math.random() * 3);
                    while (!isTrueNum) {
                        if (i == random) {
                            isTrueNum = true;
                            System.out.println(i);
                        }
                    }
                } catch (Exception e) {
                }
            }
        }) ;

        timer1.start();
        timer2.start();
    }
    }


