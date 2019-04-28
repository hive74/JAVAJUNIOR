public enum Season {

    Summer(30), Winter(-30),Autumn(10), Spring(15);

    private int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

}
