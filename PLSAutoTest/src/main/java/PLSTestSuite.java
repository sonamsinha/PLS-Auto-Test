/**
 * Created by sonamsinha on 10/14/16.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// This suite is to run all test cases for testing PLS auto website search faeture


@RunWith(Suite.class)
@SuiteClasses({ PLSTestType.class, PLSTestMake.class, PLSTestAllCars.class })
public class PLSTestSuite {
}
