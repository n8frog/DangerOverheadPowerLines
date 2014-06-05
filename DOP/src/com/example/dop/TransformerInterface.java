package game.startFile.dop;

public interface TransformerInterface extends GameObjectInterface 
{
	
	void electrify(ObjectTimer);
	void resetTTimer(ObjectTimer);
	void playerWarning(ObjectTimer);
}
