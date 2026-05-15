/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 350309527
 */
public class AlgorithmCase extends EthicsCase {
    private String biasType;

    public AlgorithmCase(String title, String description, String category, String biasType) {
        super(title, description, category);
        this.biasType = biasType;
    }

    public String getBiasType() { return biasType; }

    @Override
    public String toString() {
        return super.toString() + "\nBias Type: " + biasType;
    }
}

