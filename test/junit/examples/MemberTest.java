package junit.examples;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class MemberTest {

    @DataPoints
    public static int[] AGES = {15, 20, 25, 30};

    @DataPoints
    public static Gender[] GENDERS = Gender.values();

    @Theory
    public void canEntryは25歳以下の女性の場合にtrueを返す(int age, Gender gender) throws Exception {
        assumeTrue(age <= 25 && gender == Gender.FEMALE);
        String msg = "When age=" + age + ", gender=" + gender;
        assertThat(msg, Member.canEntry(age, gender), is(true));
    }

    @Theory
    public void canEntryは25歳以下の女性でない場合はfalseを返す(int age, Gender gender) throws Exception {
        assumeTrue(25 < age || gender != Gender.FEMALE);
        String msg = "When age=" + age + ", gender=" + gender;
        assertThat(msg, Member.canEntry(age, gender), is(false));
    }

}