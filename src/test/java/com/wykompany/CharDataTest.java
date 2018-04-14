import com.wykompany.CharData;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CharDataTest {

    @Tes
    public void addCharacterShouldAddCharacterToNameList(){

        CharData test = new CharData();
        String name = "Quallan";
        int modifier = 10;
        int roll = 3;
        test.addCharacter(name,modifier,roll);
        Assertions.assertEquals("Quallan",test.getNameList().get(0).getName(),"Name must be Quallan");
        Assertions.assertEquals(10,test.getNameList().get(0).getModifier(),"Modifier must be 10");
        Assertions.assertEquals(3,test.getNameList().get(0).getRoll(),"Roll must be 3");

    }
}
