package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.google.common.base.MoreObjects;

import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfProfileKey extends KeyDeserializer
 implements Identifier<VnfProfile> {
    private static final long serialVersionUID = -691004659524246111L;
    private final String _id;

    public VnfProfileKey() {
    	// This might be also null, or not id/flavor not final.
        this._id = "";
    }

    public VnfProfileKey(String _id) {
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfProfileKey(VnfProfileKey source) {
        this._id = source._id;
    }


    public String getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_id);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfProfileKey)) {
            return false;
        }
        final VnfProfileKey other = (VnfProfileKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfProfileKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
    
	@Override
	public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
		// TODO Auto-generated method stub
		return this.toString();
	}    
}

