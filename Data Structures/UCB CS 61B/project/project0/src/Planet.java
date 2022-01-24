public class Planet {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;
    
    public Planet(double xP, double yP, double xV, double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Planet(Planet p){
        xxPos = p.xxPos;
        yyPos = p.yyPos;
        xxVel = p.xxVel;
        yyVel = p.yyVel;
        mass = p.mass;
        imgFileName = p.imgFileName;
    }




    public double calcDistance(Planet p1){
        double distance = 0;
        double xxx = p1.xxPos - xxPos;
        double yyy = p1.yyPos - yyPos;
        distance = Math.sqrt(xxx*xxx+ yyy*yyy);

        return distance;
    }

    public double calcForceExertedBy(Planet p){
        double Gravity = 0;
        double G = 6.67e-11;
        double distance = calcDistance(p);

        Gravity = G*mass*p.mass/distance/distance;

        return Gravity;
    }

    public double calcForceExertedByX(Planet p){
        //double Gravity_X = 0;
        double Gravity = calcForceExertedBy(p);
        double dx = p.xxPos - xxPos;
        double distance = calcDistance(p);
        double Gravity_X = Gravity * dx /distance;
        System.out.println("Gravity_X = "+Gravity_X);
        return Gravity_X;
    }


    public double calcForceExertedByY(Planet p){
        double Gravity_Y = 0;
        double Gravity = calcForceExertedBy(p);
        double dy = p.yyPos - yyPos;
        double distance = calcDistance(p);
        Gravity_Y = Gravity * dy /distance;
        
        return Gravity_Y;
    }


    public double calcNetForceExertedByX(Planet[] p){

        double Net_X = 0;
        for(int i = 0;i < p.length; i = i + 1){
            if(!this.equals(p[i])){
            Net_X = Net_X + calcForceExertedByX(p[i]);
            }
        }

        return Net_X;
    }


    public double calcNetForceExertedByY(Planet[] p){

        double Net_Y = 0;
        for(int i = 0;i < p.length; i = i + 1){
            if(!this.equals(p[i])){
            Net_Y = Net_Y + calcForceExertedByY(p[i]);
            }
        }

        return Net_Y;
    }


    public void update(double d_time, double Force_X, double Force_Y){
        double accelation_X = Force_X / this.mass;
        double accelation_Y = Force_Y / this.mass;
        this.xxVel = this.xxVel + d_time * accelation_X;
        this.yyVel = this.yyVel + d_time * accelation_Y;

        this.xxPos = this.xxPos + d_time * this.xxVel;
        this.yyPos = this.yyPos + d_time * this.yyVel;
    }

    public void draw(){
        double size = 100;    
        StdDraw.picture(xxPos, yyPos, imgFileName,size,size);
    }
}
