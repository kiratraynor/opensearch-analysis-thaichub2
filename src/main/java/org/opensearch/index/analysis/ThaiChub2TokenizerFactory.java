package org.opensearch.index.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractTokenizerFactory;

public class ThaiChub2TokenizerFactory extends AbstractTokenizerFactory {

    public ThaiChub2TokenizerFactory(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(indexSettings, settings, name);
    }

    @Override
    public Tokenizer create() {
        return new ThaiChub2Tokenizer();
    }
}
