package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.deviated.constituent.cpd.id;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ConstituentCpdIdKey
 implements Identifier<ConstituentCpdId> {
    private static final long serialVersionUID = 7779325794541287399L;
    private final Object _constituentBaseElementId;
    private final Object _constituentCpdId;


    public ConstituentCpdIdKey(Object _constituentBaseElementId, Object _constituentCpdId) {
    
        this._constituentBaseElementId = _constituentBaseElementId;
        this._constituentCpdId = _constituentCpdId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConstituentCpdIdKey(ConstituentCpdIdKey source) {
        this._constituentBaseElementId = source._constituentBaseElementId;
        this._constituentCpdId = source._constituentCpdId;
    }


    public Object getConstituentBaseElementId() {
        return _constituentBaseElementId;
    }
    
    public Object getConstituentCpdId() {
        return _constituentCpdId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_constituentBaseElementId);
        result = prime * result + Objects.hashCode(_constituentCpdId);
        return result;
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstituentCpdIdKey)) {
            return false;
        }
        final ConstituentCpdIdKey other = (ConstituentCpdIdKey) obj;
        if (!Objects.equals(_constituentBaseElementId, other._constituentBaseElementId)) {
            return false;
        }
        if (!Objects.equals(_constituentCpdId, other._constituentCpdId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConstituentCpdIdKey.class);
        CodeHelpers.appendValue(helper, "_constituentBaseElementId", _constituentBaseElementId);
        CodeHelpers.appendValue(helper, "_constituentCpdId", _constituentCpdId);
        return helper.toString();
    }
}

