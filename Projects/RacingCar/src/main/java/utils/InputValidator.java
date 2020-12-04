package utils;

public class InputValidator {
    private final String BLANK_EXIST = "공백 없이 입력해야 합니다.";
    private final String OVER_MAX = "자동차의 이름은 5자 이하 입니다.";
    private final String OK = "ok";

    public String getValidateResult(String carNames) {
        return validate(carNames);
    }
    private String validate(String carNames) {
        String[] carList = carNames.split(",");
        for (String item: carList) {
            if (item.contains(" ")) {
                return BLANK_EXIST;
            }
            if (item.length() > 5) {
                return OVER_MAX;
            }
        }
        return OK;
    }
}
