public class obesidad {
    public static void main(String[] args) {

        String peso = IO.readln("Escribe tu peso en kg: ");
        String estatura = IO.readln("Escribe tu estatura en metros: ");
        Float pesoFloat = Float.parseFloat(peso);
        Float estaturaFloat = Float.parseFloat(estatura);
        Float imc = pesoFloat / (estaturaFloat * estaturaFloat);
        if (imc < 18.5) {
            System.out.println("Tu IMC es: " + imc + " y estás en bajo peso");
            System.out.println("Recomendaciones: Superávit calórico controlado enfocado en grasas saludables, proteínas magras y carbohidratos complejos.Entrenamiento de fuerza/resistencia para estimular la ganancia de masa muscular. Limitar el cardio intenso.\tDescartar trastornos de la conducta alimentaria (TCA), problemas tiroideos o malabsorción.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Tu IMC es: " + imc + " y estás en peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Tu IMC es: " + imc + " y estás en sobrepeso");
            System.out.println("Recomendaciones: Déficit calórico moderado enfocado en grasas saludables, proteínas magras y carbohidratos complejos. Entrenamiento de fuerza/resistencia para preservar la masa muscular. Cardio moderado a intenso según tolerancia. Evaluar factores hormonales, metabólicos y de estilo de vida que puedan contribuir al aumento de peso.");
        } else if (imc >= 30  && imc < 34.9) {
            System.out.println("Tu IMC es: " + imc + " y estás en obesidad grado 1");
            System.out.println("Restricción calórica estructurada guiada por profesionales. Control estricto de porciones y densidad energética baja.\tIncremento gradual de actividad física para evitar lesiones articulares. Priorizar fuerza para proteger masa muscular.\tEvaluación médica de comorbilidades. Se puede considerar tratamiento farmacológico si fallan los cambios de estilo de vida.");
        }
        else if (imc >= 35 && imc < 39.9) {
            System.out.println("Tu IMC es: " + imc + " y estás en obesidad grado 2");
            System.out.println("Planes de alimentación especializados de bajo valor calórico bajo estricta supervisión nutricional.\tEjercicio adaptado de bajo impacto (natación, elíptica, caminata, fuerza sentada) para proteger las articulaciones.\tManejo multidisciplinario obligatorio (médico, nutriólogo, psicología). Evaluación para cirugía bariátrica si existen comorbilidades.\n" + //
                                "Obesidad Grado III (≥ 40.0)\tReducción del riesgo de mortalidad y restauración de la funcionalidad física.\tDietas de muy bajo valor calórico prescritas médicamente o preparación nutricional prequirúrgica.\tMovilidad funcional y terapia física. Ejercicios sentados o en agua bajo estricta supervisión para evitar fallas cardíacas o articulares.\tCandidato prioritario a cirugía bariátrica. Monitoreo médico continuo de la función cardiovascular, apnea del sueño y diabetes.");
        }
        else if (imc >= 40) {
            System.out.println("Tu IMC es: " + imc + " y estás en obesidad grado 3");
            System.out.println("Dietas de muy bajo valor calórico prescritas médicamente o preparación nutricional prequirúrgica.\tMovilidad funcional y terapia física. Ejercicios sentados o en agua bajo estricta supervisión para evitar fallas cardíacas o articulares.\tCandidato prioritario a cirugía bariátrica. Monitoreo médico continuo de la función cardiovascular, apnea del sueño y diabetes.\tEvaluación psicológica para adherencia a cambios de estilo de vida y manejo de trastornos de la conducta alimentaria (TCA).");
        }
        
    }
}