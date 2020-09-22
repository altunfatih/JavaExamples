package TVSimulation;

public class FinancialChannel extends Channel{

    private String financialType;

    public FinancialChannel(String name, int channelNo, String financialType) {
        super(name, channelNo);
        this.financialType = financialType;
    }
}
