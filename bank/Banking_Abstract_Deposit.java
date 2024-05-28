package bank;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Banking_Abstract_Deposit {
    abstract public void Deposit(String depositAmount) throws IOException;
}
