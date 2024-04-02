package org.opensearch.plugin.analysis.thaichub2;

import static java.util.Collections.singletonMap;

import org.apache.lucene.analysis.Analyzer;
import org.opensearch.index.analysis.AnalyzerProvider;
import org.opensearch.index.analysis.TokenizerFactory;
import org.opensearch.index.analysis.ThaiChub2AnalyzerProvider;
import org.opensearch.index.analysis.ThaiChub2TokenizerFactory;
import org.opensearch.indices.analysis.AnalysisModule;
import org.opensearch.plugins.AnalysisPlugin;
import org.opensearch.plugins.Plugin;

import java.util.Map;

public class AnalysisThaiChub2Plugin extends Plugin implements AnalysisPlugin{

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<AnalyzerProvider<? extends Analyzer>>> getAnalyzers() {
        return singletonMap("thaichub2_analyzer", ThaiChub2AnalyzerProvider::new);
    }

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> getTokenizers() {
        return singletonMap("thaichub2_tokenizer", ThaiChub2TokenizerFactory::new);
    }

}
