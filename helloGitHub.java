import java.util.Random;
import java.util.Scanner;

public class helloGitHub {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int answer = random.nextInt(100) + 1;
		int attempts = 0;

		System.out.println("猜数字游戏：我已经想好了一个 1 到 100 的数字！");

		while (true) {
			System.out.print("请输入你的猜测：");
			if (!scanner.hasNextInt()) {
				System.out.println("请输入有效的整数。");
				scanner.next();
				continue;
			}

			int guess = scanner.nextInt();
			attempts++;

			if (guess < answer) {
				System.out.println("太小了！");
			} else if (guess > answer) {
				System.out.println("太大了！");
			} else {
				System.out.println("恭喜你，猜对了！共猜了 " + attempts + " 次。");
				break;
			}
		}

		scanner.close();
	}
}
