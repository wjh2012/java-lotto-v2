package lotto;

import java.util.List;

public class Lotto {

    private static final int NUMBER_SIZE = 6;
    private static final int NUMBER_START_INCLUSIVE = 1;
    private static final int NUMBER_END_INCLUSIVE = 45;

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

    private void validateRange(List<Integer> numbers) {
        if (!validateNumbers(numbers)){
            throw new IllegalArgumentException();
        }
    }

    private boolean validateNumbers(List<Integer> numbers){
        return numbers.stream()
                .allMatch(this::rangeCheck);
    }

    private boolean rangeCheck(int number) {
        return number >= NUMBER_START_INCLUSIVE && number <= NUMBER_END_INCLUSIVE;
    }


    // TODO: 추가 기능 구현
}
