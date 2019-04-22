public class ElectroCar {
    private int id;

    // вложенный нестатический класс
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" + id + "is starting");
        }
    }

    // статический вложенный класс
    public static class Battery{
        private void charge(){
            System.out.println("Battery is charging");
        }

    }



    public ElectroCar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;
        class SomeClass{
            public void SomeMethod(){
                System.out.println(x);
                System.out.println(id);
            }

        }
        SomeClass someObj = new SomeClass();

        System.out.println("ElectroCar" + id + "is starting");
    }


}
