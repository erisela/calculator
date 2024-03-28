package calculatorjava;

public class Memory {
    public double memoryValue;
    public void addToMemory( double newValue){
             memoryValue += newValue;
        //TO-DO == shton nje vlere te re ne memorie
    }
        public double recall(){
            return memoryValue;
            //TO-DO == kthen vleren e memories
        }
     

        public void clearMemory() {
        	memoryValue=0.0;
        }
}
