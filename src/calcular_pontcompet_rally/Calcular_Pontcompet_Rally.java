package calcular_pontcompet_rally;

import javax.swing.*;

public class Calcular_Pontcompet_Rally {

    public static void main(String[] args) {
        
        double tempCompetidor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Tempo do Competidor:"));
        double tempminimEtapa = Double.parseDouble(JOptionPane.showInputDialog("Informe o Tempo mínimo para a Etapa:"));
        
        double diferenca = tempCompetidor - tempminimEtapa;
        
        if(diferenca < 3){
            JOptionPane.showMessageDialog(null, "Tempo do Competidor: "+tempCompetidor+" mim\nTempo Minimo p/ Etapa: "
                    +tempminimEtapa+" min\nDiferença de Tempo: "+diferenca+" min\nVocê alcançou 100 pontos.");
        }else{
            if(diferenca >= 3 && diferenca <= 5){
                JOptionPane.showMessageDialog(null, "Tempo do Competidor: "+tempCompetidor+" mim\nTempo Minimo p/ Etapa: "
                    +tempminimEtapa+" min\nDiferença de Tempo: "+diferenca+" min\nVocê alcançou 80 pontos.");
            }else{
                double diferencaMaiorqCinco = (80 - ((diferenca - 5) / 5));
                JOptionPane.showMessageDialog(null, "Tempo do Competidor: "+tempCompetidor+" mim\nTempo Minimo p/ Etapa: "
                    +tempminimEtapa+" min\nDiferença de Tempo: "+diferenca+" min\nVocê alcançou "+diferencaMaiorqCinco+" pontos.");
            }
        }
    }
    
}
