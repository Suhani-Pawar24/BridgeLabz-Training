import java.util.Scanner;
class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
		if (radius < 0 || height < 0) {
            scanner.close();
            return;
        }
		double volume = Math.PI * radius * radius * height;
		System.out.println(volume);
		scanner.close();
    }
}