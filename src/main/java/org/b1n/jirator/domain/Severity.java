package org.b1n.jirator.domain;

/**
 * Severidade.
 * @author Marcio Ribeiro
 * @date May 3, 2008
 */
public enum Severity {
    /** Nao definida. */
    UNDEFINED("N�o definida", null, 0),

    /** Muito baixa. */
    MUITO_BAIXA("Muito Baixa", "Muito Baixa", 1),

    /** Baixa. */
    BAIXA("Baixa", "Baixa", 2),

    /** M�dia. */
    MEDIA("M�dia", "M�dia", 3),

    /** Alta. */
    ALTA("Alta", "Alta", 4),

    /** Cr�tica. */
    CRITICA("Cr�tica", "Cr�tica", 5);

    private String name;

    private Integer value;

    private Object jiraValue;

    /**
     * Construtor.
     * @param name nome.
     * @param jiraValue valor no jira.
     * @param value valor.
     */
    Severity(final String name, final Object jiraValue, final Integer value) {
        this.name = name;
        this.value = value;
        this.jiraValue = jiraValue;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @return the jiraValue
     */
    public Object getJiraValue() {
        return jiraValue;
    }

    /**
     * @return to string.
     */
    @Override
    public String toString() {
        return name + " (" + value + ")";
    }
}
