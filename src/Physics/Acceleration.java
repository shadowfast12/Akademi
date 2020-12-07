package Physics;

public class Acceleration {

    //xf=xi+vi*t+((1/2*a)*t^2)
    public static double distance_traveled(double i_distance,double acceleration, double i_speed, double time){
        return i_distance+(i_speed*time)+(0.5*acceleration)*Math.pow(time,2);
    }

    public static String s_distance_traveled(double i_distance,double acceleration, double i_speed,double time){
        String res = "";

        res+="xf=xi+(vi*t)+((1/2*a)*t^2)"+"\n";
        res+="xf="+i_distance+"+("+i_speed+"*"+time+")+((1/2*"+acceleration+")*"+time+"^2)\n";
        res+="xf="+i_distance+"+"+(i_speed*time)+"+("+(0.5*acceleration)+"*"+Math.pow(time,2)+")\n";
        res+="xf="+i_distance+(i_speed*time)+"+"+(0.5*acceleration)*Math.pow(time,2)+"\n";
        res+="xf="+distance_traveled(i_distance,acceleration,i_speed,time);

        return res;
    }

    //xf=xi+vi*t+((1/2*a)*t^2)
    public static double time_frosda(double f_position, double i_position, double acceleration){
        return Math.sqrt((f_position-i_position)/((0.5*acceleration)));
    }

    public static String s_time_frosda(double f_position,double i_velocity, double i_position, double acceleration){
        String res="";

        res+="xf=xi+(vi*t)+((1/2*a)*t^2)"+"\n";
        res+=f_position+"="+i_position+"+("+i_velocity+"*t)"+"+((1/2*"+acceleration+")*t^2"+"\n";
        res+=f_position-i_position+"="+0.5*acceleration+"t^2)"+"\n";
        res+=((f_position-i_position)/(acceleration*0.5))+"=t^2"+"\n";
        res+="t="+time_frosda(f_position,i_position,acceleration)+" seconds";

        return res;

    }

    //a=f/m
    public static double newtons_2(double mass, double net_force){
        return net_force/mass;
    }

    public static String s_newtons_2(double mass, double net_force){
        String res ="";
        res+="a=f/m"+"\n";
        res+="a="+net_force+"/"+mass+"\n";
        res+="a="+newtons_2(mass,net_force)+" m/s^2";

        return res;
    }

    public static double speed_dif(double i_velocity,double f_velocity, double time){
        return (f_velocity-i_velocity)/time;
    }

    public static double velocity_spec(double distance_final,double distance_inital,double seconds){
        return (distance_final-distance_inital)/seconds;
    }

    //xf=xi+vx*t
    public static String s_velocity_spec(double distance_final,double distance_inital,double seconds){
        String res = "";

        res+="xf=xi+vx*t"+"\n";
        res+=distance_final+"="+distance_inital+"+vx*"+seconds+"\n";
        res+="vx="+(distance_final-distance_inital)+"/"+seconds+"\n";
        res+="vx="+(velocity_spec(distance_final,distance_inital,seconds))+" m/s";

        return res;
    }
}
