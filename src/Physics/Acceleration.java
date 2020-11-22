package Physics;

public class Acceleration {

    public static double distance_traveled(double i_speed, double distance, double time){
        return (distance-(i_speed*time))/(Math.pow(time,2)/2);
    }

    public static double newtons_2(double mass, double net_force){
        return net_force/mass;
    }

    public static double speed_dif(double i_velocity,double f_velocity, double time){
        return (f_velocity-i_velocity)/time;
    }
}
