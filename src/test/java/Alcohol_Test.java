import be.ecam.gestionAlcohol.beans.Alcohol_;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Alcohol_ Tester. 
* 
* @author <Team 4>
*/ 
public class Alcohol_Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getId_() 
* 
*/ 
@Test
public void testGetId_() throws Exception {
    //TODO: Test goes here...
} 

/** 
* 
* Method: setId_(long id_) 
* 
*/ 
@Test
public void testSetId_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getName_() 
* 
*/ 
@Test
public boolean testGetName_() throws Exception {
    Alcohol_ alc = new Alcohol_.Builder_("test", "13%").build_();
    if (alc.getName_() == "test" ) {
        return(true);
    }
    return (false);
} 

/** 
* 
* Method: setName_(String name_) 
* 
*/ 
@Test
public void testSetName_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getProvider_() 
* 
*/ 
@Test
public void testGetProvider_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setProvider_(String provider_) 
* 
*/ 
@Test
public void testSetProvider_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getLevel_() 
* 
*/ 
@Test
public void testGetLevel_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setLevel_(String level_) 
* 
*/ 
@Test
public void testSetLevel_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getCountry_() 
* 
*/ 
@Test
public void testGetCountry_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setCountry_(String country_) 
* 
*/ 
@Test
public void testSetCountry_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: id_(long id) 
* 
*/ 
@Test
public void testId_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: provider_(String provider) 
* 
*/ 
@Test
public void testProvider_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: country_(String country) 
* 
*/ 
@Test
public void testCountry_() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: build_() 
* 
*/ 
@Test
public void testBuild_() throws Exception { 
//TODO: Test goes here... 
} 


} 
