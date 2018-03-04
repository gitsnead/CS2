
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        // write test code here
        ProductContainerRecorder kahvi = new ProductContainerRecorder("kahvi", 10.0, 5.0);
        Double v = kahvi.takeFromTheContainer(7.0);
        System.out.println(v);
    }
}
