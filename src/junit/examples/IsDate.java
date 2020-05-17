package junit.examples;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * カスタムMatcherの定義
 */
public class IsDate extends BaseMatcher {

    private final int yyyy;
    private final int mm;
    private final int dd;
    Object actual;

    /**
     * コンストラクタ
     * ファクトリメソッドで受け取るパラメータをMatcherオブジェクトで保持するため定義
     * @param yyyy
     * @param mm
     * @param dd
     */
    IsDate(int yyyy, int mm, int dd) {
        this.yyyy = yyyy;
        this.mm = mm;
        this.dd = dd;
    }

    /**
     * 実測値を引数に取る
     * @param actual
     * @return 全て期待値としてフィールドに保持している値と一致する場合は、true
     */
    @Override
    public boolean matches(Object actual) {
        this.actual = actual;
        if (!(actual instanceof Date)) return  false;
        Calendar cal = Calendar.getInstance();
        cal.setTime((Date) actual);

        if (yyyy != cal.get(Calendar.YEAR)) return false;
        if (mm != cal.get(Calendar.MONTH) + 1) return false;
        if (dd != cal.get(Calendar.DATE)) return false;
        return true;
    }

    /**
     * matchesメソッドがfalseを返した時に呼ばれるメソッド
     * 比較検証が失敗した理由を通知する
     * @param desc 検証失敗の情報を保持するためのオブジェクト
     */
    @Override
    public void describeTo(Description desc) {
        desc.appendValue(String.format("%d/%02d/%02d", yyyy, mm, dd));
        if (actual != null){
            desc.appendText(" but actual is ");
            desc.appendValue(new SimpleDateFormat("yyyy/MM/dd").format((Date) actual));
        }
    }

    /**
     * カスタムMatcherをstaticインポートできるようにするために、ファクトリメソッドを定義
     * @param yyyy
     * @param mm
     * @param dd
     * @return
     */
    public static Matcher<Date> dateOf(int yyyy, int mm, int dd){
        return new IsDate(yyyy, mm, dd);
    }
}
