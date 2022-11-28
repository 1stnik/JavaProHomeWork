package homeWork13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {

    // StreamA tests
    @Test
    void createList() {
        List<Integer> expList = List.of(0, 0, 0, 0, 0, 0);
        Assertions.assertEquals(expList, StreamA.createList());
    }

    @Test
    void getAverage() {
        List<Integer> iList = List.of(0, 1, 2, 3, 4, 5);
        Assertions.assertEquals(2.5, StreamA.getAverage(iList));
        Assertions.assertEquals(0.0, StreamA.getAverage(null));
    }

    // StreamB tests
    @Test
    void createNewList() {
        List<String> expList = List.of("-", "-", "-", "-", "-", "-");
        Assertions.assertEquals(expList, StreamB.createNewList());
    }

    @Test
    void getListPair() {
        Pair pairA = new Pair();
        List<String> inList = List.of("a", "b", "c");
        List<String> outList = List.of("{a:A}", "{b:B}", "{c:C}");
        List<Pair> expList = new ArrayList<>();
        pairA.setListA(inList);
        pairA.setListB(outList);
        expList.add(pairA);
        List<Pair> resList = StreamB.getListPair(inList);
        Assertions.assertEquals(expList, resList);

        // test with 'null' value
        Pair pairB = new Pair();
        inList = List.of("-", "-", "-", "-", "-", "-");
        outList = List.of("{-:-}", "{-:-}", "{-:-}", "{-:-}", "{-:-}", "{-:-}");
        pairB.setListA(inList);
        pairB.setListB(outList);
        List<Pair> expNullList = new ArrayList<>();
        expNullList.add(pairB);
        resList = StreamB.getListPair(null);
        Assertions.assertEquals(expNullList, resList);
    }

    // StreamC test
    @Test
    void getLowerCaseString() {
        StreamC streamC = new StreamC();
        List<String> srcList = List.of("abcd", "Abcd", "abcde", "Abcde", "ABCD", "abcdef",
                "fghi", "fgHi", "FGhij", "klmn", "klmnop", "klmN");
        List<String> expectList = List.of("abcd", "fghi", "klmn");
        List<String> iList = streamC.getLowerCaseString(srcList);
        Assertions.assertEquals(expectList, iList);
    }
}