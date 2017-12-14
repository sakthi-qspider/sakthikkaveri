package multiplebrowser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Annotationtransformer implements IAnnotationTransformer{
public void transform(ITestAnnotation annotation,Class testclass, Constructor tetconstructor,Method testmethod) {
	annotation.setRetryAnalyzer(getClass());
	
}
}
