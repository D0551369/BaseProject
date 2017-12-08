package D0551369class1;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class class1Test {
    @Test
    public void getType() throws Exception {

        // Arrange
        class1 triangle = new class1(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
