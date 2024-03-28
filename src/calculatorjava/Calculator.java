package calculatorjava;

	public class Calculator {
	    Memory memory = new Memory();

	    public double gjejshumen(double nr1, double nr2) {
	        double rezultati = nr1 + nr2;
	        memory.addToMemory(rezultati);
	        return rezultati;

	    }

	    public double gjejdiferencen(double nr1, double nr2) {
	        double rezultati = nr1 - nr2;
	        memory.addToMemory(rezultati);
	        return rezultati;
	    }

	    public double gjejprodhimin(double nr1, double nr2) {
	        double rezultati = nr1 * nr2;
	        memory.addToMemory(rezultati);
	        return rezultati;

	    }

	    public double bejpjestimin(double nr1, double nr2) {


	        if (nr2 != 0) {
	            double rezultati = nr1 / nr2;
	            memory.addToMemory(rezultati);
	            return rezultati;
	        } else {
	            System.out.println("Printimi me 0 nuk mund te behet");
	            return 0.0;
	        }


	    }

	    public double gjejRrenjenkatrore(double nr1) {
	        if (nr1 < 0) {
	            System.out.println("Error: numri duhet te jete pozitiv per te llogaritur rrenjen katrore");
	            return 0.0;
	        } else {
	            double rezultati = Math.sqrt(nr1);
	            memory.addToMemory(rezultati);
	            return rezultati;
	        }
	    }
	   
	

	    }

	
