package enums;

import java.security.SecureRandom;
import java.util.Random;

public enum EFlowsOptions {
    actualPage_TO_TrendingArticles,
    actualPage_TO_FurtherInspiration;

    private static final SecureRandom random = new SecureRandom();

    public static EFlowsOptions getRandomUserFlow() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
