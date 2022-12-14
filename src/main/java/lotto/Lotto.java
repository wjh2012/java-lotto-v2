package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateSize(numbers);
        validateRange(numbers);
        this.numbers = numbers;
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
}
