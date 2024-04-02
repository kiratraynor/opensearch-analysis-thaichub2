package org.opensearch.index.analysis;

import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractIndexAnalyzerProvider;

public class ThaiChub2AnalyzerProvider extends AbstractIndexAnalyzerProvider<ThaiChub2Analyzer> {

    private final ThaiChub2Analyzer analyzer;

    public ThaiChub2AnalyzerProvider(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(indexSettings, name, settings);
        this.analyzer = new ThaiChub2Analyzer();
    }

    @Override
    public ThaiChub2Analyzer get() {
        return this.analyzer;
    }

}
