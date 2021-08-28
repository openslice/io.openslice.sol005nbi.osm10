package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.extended.vnf.configuration;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class Day12Key
 implements Identifier<Day12> {
    private static final long serialVersionUID = 927482176980315623L;
    private final String _id;


    public Day12Key(String _id) {
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Day12Key(Day12Key source) {
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
        if (!(obj instanceof Day12Key)) {
            return false;
        }
        final Day12Key other = (Day12Key) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(Day12Key.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

