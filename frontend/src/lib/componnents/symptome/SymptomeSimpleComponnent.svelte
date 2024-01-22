<script lang="ts">
	import type { Symptome } from "$lib/api/data-contracts";
	import { Card } from "@svelteuidev/core";

    export let data: Symptome;
</script>

<Card>
    <Card.Section>{data.nom ?? "Undefined"}</Card.Section>
</Card>