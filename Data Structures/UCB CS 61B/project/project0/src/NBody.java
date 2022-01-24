public class NBody {
    public static double readRadius(String filename){

        In file = new In(filename);
		int Number = file.readInt();
        double Radius = file.readDouble();
        System.out.println("Radius :" + Radius);
        return Radius;
    }

	public static int readNumber(String filename){

		In file = new In(filename);
		int Number = file.readInt();

		return Number;
	}



	public static Planet[] readPlanets(String filename){
		In file = new In(filename);

		int Number = file.readInt();
		Planet [] P_array = new Planet[Number];
		
		double Radius = file.readDouble();
		for(int i = 0; i < Number; i = i + 1){
			double xxPos = file.readDouble();
			double yyPos = file.readDouble();
			double xxVel = file.readDouble();
			double yyVel = file.readDouble();
			double mass = file.readDouble();
			String imgFileName = file.readString();
			P_array[i] = new Planet(xxPos,yyPos,xxVel,yyVel,mass,imgFileName);
		}

		return P_array;

	}

	public static void drawPlanet(Planet planet, double Radius){
		// int pausetime = 1000;
		double x = planet.xxPos;
		double y = planet.yyPos;
		StdDraw.setScale(-Radius,Radius);
		String imageToDraw = "images/" + planet.imgFileName;

		// StdDraw.clear();
		StdDraw.picture(x, y, imageToDraw);


		StdDraw.show();
		// StdDraw.pause(pausetime);
	}

	public static void drawRandom(Planet planet, double Radius){
		int waitTimeMilliseconds = 100;

		int count = 0;
		while(count < 200){

			
			double x = StdRandom.uniform(-90,90);
			double y = StdRandom.uniform(-90,90);
			String imageToDraw = "images/" + planet.imgFileName;

			// StdDraw.clear();
			StdDraw.picture(x, y, imageToDraw);
			StdDraw.show();
			StdDraw.pause(waitTimeMilliseconds);

			waitTimeMilliseconds -= 1;
			if (waitTimeMilliseconds < 1){
				waitTimeMilliseconds = 10;
			}
		
			count += 1;
		
		}
	}

	public static void drawZoom(Planet planet, double Radius) {
		StdDraw.enableDoubleBuffering();


		String imageToDraw = "images/" + planet.imgFileName;
		double size = 100;
		while(size < 500){
			double x = 0;
			double y = 0;
			// StdDraw.clear();
			StdDraw.picture(x, y, imageToDraw, size, size);
			StdDraw.show();
			size += 1;
		}



		while(size > 1){
			double x = 0;
			double y = 0;

			StdDraw.clear();
			StdDraw.picture(x, y, imageToDraw, size, size);
			StdDraw.show();
			size -= 1;

		}
	}
	

	
    public static void main(String[] args){

		int pausetime = 5;
		double T = Double.valueOf(args[0]);
		double dt = Double.parseDouble(args[1]);
		String filename = args[2];

		double Radius = readRadius(filename);
		int Number = readNumber(filename);

		Planet[] planets_array = readPlanets(filename);
		String background = "images/starfield.jpg";
		StdDraw.clear();
		String audioToPlay = "Audio/2001.mid";
		StdAudio.play(audioToPlay);
		


			
		StdDraw.enableDoubleBuffering();
		double time = 0;


		while(time < T)
		{
			for(int i = 0;i < Number; i += 1)
			{
				double[] xForces = new double[Number];
				double[] yForces = new double[Number];
				xForces[i] = planets_array[i].calcNetForceExertedByX(planets_array);
				yForces[i] = planets_array[i].calcNetForceExertedByY(planets_array);
				planets_array[i].update(dt,xForces[i],yForces[i]);
			}

			StdDraw.clear();
			StdDraw.enableDoubleBuffering();
			StdDraw.picture(0.5, 0.5, background);
			StdDraw.show();

			for(int i = 0;i < Number ;i += 1){
				drawPlanet(planets_array[i], Radius);
			}
			StdDraw.pause(pausetime);

			time += dt;
			
		}

		
		StdOut.printf("%d\n",planets_array.length);
		StdOut.printf("%.2e\n",Radius);
		for(int i = 0;i < planets_array.length; i++){
			StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
			planets_array[i].xxPos,planets_array[i].yyPos,
			planets_array[i].xxVel,planets_array[i].yyVel,
			planets_array[i].mass, planets_array[i].imgFileName);
		}
	
	
	
	
	}


    
}
