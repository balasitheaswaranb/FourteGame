package com.fourte.game;

import java.util.Scanner;

public class Fourte {
	public static void main(String args[]) {
		Fourte fourte = new Fourte();
		fourte.run();
	}

	private void run() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number :");
		int number1 = scanner.nextInt();
		System.out.print("Enter number :");
		int number2 = scanner.nextInt();
		System.out.print("Enter number :");
		int number3 = scanner.nextInt();
		System.out.print("Enter number :");
		int number4 = scanner.nextInt();
		System.out.print("Enter target number :");
		int target = scanner.nextInt();

		char[] operators = { '+', '-', '*' };
		int iValue = 0;
		int jValue = 0;

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				iValue = (number1 + number2);
			} else if (i == 1) {
				iValue = (number1 - number2);
			}

			else if (i == 2) {
				iValue = (number1 * number2);
			}
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					jValue = iValue + number3;
				} else if (j == 1) {
					jValue = iValue - number3;
				}

				else if (j == 2) {
					jValue = iValue * number3;
				}
				for (int k = 0; k < 3; k++) {
					if (k == 0) {
						if (jValue + number4 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number2 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number4);
						}
					} else if (k == 1) {
						if (jValue - number4 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number2 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number4);
						}
					} else if (k == 2) {
						if (jValue * number4 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number2 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number4);
						}
					}
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				iValue = (number4 + number3);
			} else if (i == 1) {
				iValue = (number4 - number3);
			}

			else if (i == 2) {
				iValue = (number4 * number3);
			}
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					jValue = iValue + number2;
				} else if (j == 1) {
					jValue = iValue - number2;
				}

				else if (j == 2) {
					jValue = iValue * number2;
				}
				for (int k = 0; k < 3; k++) {
					if (k == 0) {
						if (jValue + number1 == target) {
							System.out.println(number4 + "" + (operators[i]) + "" + number3 + (operators[j]) + ""
									+ number2 + (operators[k]) + "" + number1);
						}
					} else if (k == 1) {
						if (jValue - number1 == target) {
							System.out.println(number4 + "" + (operators[i]) + "" + number3 + (operators[j]) + ""
									+ number2 + (operators[k]) + "" + number1);
						}
					} else if (k == 2) {
						if (jValue * number1 == target) {
							System.out.println(number4 + "" + (operators[i]) + "" + number3 + (operators[j]) + ""
									+ number2 + (operators[k]) + "" + number1);
						}
					}
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				iValue = (number4 + number2);
			} else if (i == 1) {
				iValue = (number4 - number2);
			}

			else if (i == 2) {
				iValue = (number4 * number2);
			}
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					jValue = iValue + number3;
				} else if (j == 1) {
					jValue = iValue - number3;
				}

				else if (j == 2) {
					jValue = iValue * number3;
				}
				for (int k = 0; k < 3; k++) {
					if (k == 0) {
						if (jValue + number1 == target) {
							System.out.println(number4 + "" + (operators[i]) + "" + number2 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number1);
						}
					} else if (k == 1) {
						if (jValue - number1 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number2 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number1);
						}
					} else if (k == 2) {
						if (jValue * number1 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number2 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number1);
						}
					}
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				iValue = (number1 + number4);
			} else if (i == 1) {
				iValue = (number1 - number4);
			}

			else if (i == 2) {
				iValue = (number1 * number4);
			}
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					jValue = iValue + number3;
				} else if (j == 1) {
					jValue = iValue - number3;
				}

				else if (j == 2) {
					jValue = iValue * number3;
				}
				for (int k = 0; k < 3; k++) {
					if (k == 0) {
						if (jValue + number2 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number4 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number2);
						}
					} else if (k == 1) {
						if (jValue - number2 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number4 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number2);
						}
					} else if (k == 2) {
						if (jValue * number2 == target) {
							System.out.println(number1 + "" + (operators[i]) + "" + number4 + (operators[j]) + ""
									+ number3 + (operators[k]) + "" + number2);
						}
					}
				}
			}
		}

		iValue = 0;
		jValue = 0;

	
		scanner.close();
	}
}