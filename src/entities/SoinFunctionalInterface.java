package entities;
@FunctionalInterface
public interface SoinFunctionalInterface {
	
public void seSoigner();

public default String getDefaultMethod(int i) {
	return "Voici ton paramètre : "+i;
}
}
