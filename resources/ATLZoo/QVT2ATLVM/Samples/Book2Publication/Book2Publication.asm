<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm name="0">
	<cp>
		<constant value="Book2Publication"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="Book"/>
		<constant value="BOOK"/>
		<constant value="bookModel"/>
		<constant value="J.allInstancesFrom(J):J"/>
		<constant value="1"/>
		<constant value="J.book_to_publication():J"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="iter1"/>
		<constant value="self"/>
		<constant value="book_to_publication"/>
		<constant value="MBOOK!Book;"/>
		<constant value="Publication"/>
		<constant value="PUB"/>
		<constant value="0"/>
		<constant value="title"/>
		<constant value="chapters"/>
		<constant value="2"/>
		<constant value="nbPages"/>
		<constant value="J.sum():J"/>
		<constant value="result"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
			<push arg="3"/>
			<push arg="4"/>
			<new/>
			<push arg="5"/>
			<push arg="6"/>
			<findme/>
			<push arg="7"/>
			<call arg="8"/>
			<iterate/>
			<store arg="9"/>
			<load arg="9"/>
			<call arg="10"/>
			<call arg="11"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="12" begin="9" end="12"/>
			<lve slot="0" name="13" begin="0" end="13"/>
		</localvariabletable>
	</operation>
	<operation name="14">
		<context type="15"/>
		<parameters>
		</parameters>
		<code>
			<push arg="16"/>
			<push arg="17"/>
			<new/>
			<store arg="9"/>
			<load arg="9"/>
			<load arg="18"/>
			<get arg="19"/>
			<set arg="19"/>
			<load arg="9"/>
			<push arg="3"/>
			<push arg="4"/>
			<new/>
			<load arg="18"/>
			<get arg="20"/>
			<iterate/>
			<store arg="21"/>
			<load arg="21"/>
			<get arg="22"/>
			<call arg="11"/>
			<enditerate/>
			<pushi arg="18"/>
			<call arg="11"/>
			<call arg="23"/>
			<set arg="22"/>
			<load arg="9"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="12" begin="15" end="18"/>
			<lve slot="1" name="24" begin="3" end="24"/>
			<lve slot="0" name="13" begin="0" end="24"/>
		</localvariabletable>
	</operation>
</asm>
